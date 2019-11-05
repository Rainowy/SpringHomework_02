document.addEventListener("DOMContentLoaded", function () {
    console.log("DOM content fully loaded and parsed")

    $('input').on('click', function () {

        $.ajax({
            type: 'POST',
            url: "/account/showCookie",
            dataType: ''
            success: function (data) {
                // console.log('success',data);
                // window.location.href="/account/showCookie"
                if (data) {
                    window.location.href = "/account/showCookie";
                    // window.location.href="/account/addAccount";
                }
                else {
                    // window.location.href="/account/showCookie";
                    window.location.href = "/account/addAccount";
                }
            },
            error: function (exception) {
                alert('Exeption:' + exception);
            }
        });
        // e.preventDefault();
    });
})





