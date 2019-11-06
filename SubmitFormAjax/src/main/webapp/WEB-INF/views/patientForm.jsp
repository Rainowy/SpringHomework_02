<%--
  Created by IntelliJ IDEA.
  User: tomasz
  Date: 06.11.19
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>strefaserca.pl</title>

    <style type="text/css">
        span.error {
            color: red;
            margin-left: 5px;
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript">

        $(function () {
            /*Submit form using Ajax */

            $('button[type=submit]').click(function (e) {

                //Prevent default submission of form
                e.preventDefault();

                //Remove all errors
                $('input').next().remove();

                $.post({
                    url: 'savePatient',
                    data: $('form[name=patientForm]').serialize(),
                    success: function (res) {

                        if (res.validated) {
                            $('#resultContainer pre code').text(JSON.stringify(res.patient));
                            $('#resultContainer').show();
                        }


                    }
                }

            })

        })


    </script>

</head>
<body>
<h1>hello</h1>
</body>
</html>
