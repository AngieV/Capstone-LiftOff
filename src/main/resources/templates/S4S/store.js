//check to see if doc is done loading or there won't be anything in <body>
// because these elements have not been generated; event will fire when loading is complete
if (document.readyState == 'loading') {
    document.addEventListener('DOMContentLoaded', ready)
} else {
    ready()
}

function ready() {
    // all shop actions are assigned here 
    // get all elements on page w/ClassName 'btn-danger' and assign to variable
    let removeCartItemButtons = document.getElementsByClassName('btn-danger')
    // setup event listeners on these buttons
    for (let i = 0; i < removeCartItemButtons.length; i++) {
        let button = removeCartItemButtons[i]
        //assign the event
        button.addEventListener('click', removeCartItem)
    }

    // get all elements on page w/ClassName 'cart-quantity-input' and assign to variable
    let quantityInputs = document.getElementsByClassName('cart-quantity-input')
    for (let i = 0; i < quantityInputs.length; i++) {
        // setup event listeners on these inputs
        var input = quantityInputs[i]
        input.addEventListener('change', quantityChanged)
    }

    // get all elements on page w/ClassName 'shop-item-button' and assign to variable
    let addToCartButtons = document.getElementsByClassName('shop-item-button')
    for (let i = 0; i < addToCartButtons.length; i++) {
        // setup event listeners on these buttons
        let button = addToCartButtons[i]
        button.addEventListener('click', addToCartClicked)
    }

    document.getElementsByClassName('btn-purchase')[0].addEventListener('click', purchaseClicked)
}

function purchaseClicked() {
    alert('Thank you for your purchase')
    var cartItems = document.getElementsByClassName('cart-items')[0]
    while (cartItems.hasChildNodes()) {
        cartItems.removeChild(cartItems.firstChild)
    }
    updateCartTotal()
}

function removeCartItem(event) {
        //An event listener always returns an event object inside the function it calls 
        //and this event object has a property called target. In this case the target is 
        //whatever button we clicked on; the target is then the row
        let buttonClicked = event.target
        buttonClicked.parentElement.parentElement.remove()
        updateCartTotal()
    }

    function quantityChanged(event) {
        let input = event.target
        //check the input value-if it is a number it should be >= 1
        if (isNaN(input.value) || input.value <= 0) {
            input.value = 1
        }
        updateCartTotal()
    }

    function addToCartClicked(event) {
        let button = event.target
        //get item, image, price and qty
        let shopItem = button.parentElement.parentElement
        let title = shopItem.getElementsByClassName('shop-item-title')[0].innerText
        let price = shopItem.getElementsByClassName('shop-item-price')[0].innerText
        let imageSrc = shopItem.getElementsByClassName('shop-item-image')[0].src
        addItemToCart(title, price, imageSrc)
        updateCartTotal()
    }

    function addItemToCart(title, price, imageSrc){
        let cartRow = document.createElement('div')
        //add cart-row class to cartRow div (for css styling)
        cartRow.classList.add('cart-row')
        let cartItems = document.getElementsByClassName('cart-items')[0]
        //check to see if item is already in cart
        let cartItemNames = cartItems.getElementsByClassName('cart-item-title')
        for (let i = 0; i < cartItemNames.length; i++) {
            if (cartItemNames[i].innerText == title) {
                alert('Item is already in the cart. Change quantity if desired.')
                return
            }
        }
        // back ticks allow multiple lines of html copied from shop and use of ${ }
        let cartRowContents = ` 
            <div class="cart-item cart-column">
                <img class="cart-item-image" src="${imageSrc}" width="100" height="100">
                <span class="cart-item-title">${title}</span>
            </div>
            <span class="cart-price cart-column">${price}</span>
            <div class="cart-quantity cart-column">
                <input class="cart-quantity-input" type="number" value="1">
                <button class="btn btn-danger" type="button">REMOVE</button>
            </div>`
        // use innerHTML because cartRowContents is html
        cartRow.innerHTML = cartRowContents
        cartItems.append(cartRow)
        //add event listeners for remove item and qty changes
        cartRow.getElementsByClassName('btn-danger')[0].addEventListener('click', removeCartItem)
        cartRow.getElementsByClassName('cart-quantity-input')[0].addEventListener('change', quantityChanged)
    }

    function updateCartTotal() {
        //get all items in cart by accessing the topmost container
        //getElementsByClassName returns an array, first item contains all items in cart
        let cartItemContainer = document.getElementsByClassName("cart-items")[0]
        //each row contains a different item; get each item, price & quantity
        let cartRows = cartItemContainer.getElementsByClassName("cart-row")
        let total = 0
        for (let i = 0; i < cartRows.length; i++) {
            let cartRow = cartRows[i]
            let itemPrice = cartRow.getElementsByClassName("cart-price")[0]
            let itemQty = cartRow.getElementsByClassName("cart-quantity-input")[0]
            //strip the $ and cast the string to a decimal number
            let price = parseFloat(itemPrice.innerText.replace("$", ""))
            let qty = itemQty.innerValue
             total = total + (price * qty)
        }
        //round to 2 decimal places
        total = Math.round(total * 100)/100
        document.getElementsByClassName("cart-total-price")[0].innerText = '$' + total
    }