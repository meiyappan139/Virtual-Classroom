
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>VIRTUAL CLASSROOM</title>
        <link rel="stylesheet" type="text/css" href="bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="create_clas.css">
    </head>
    <body>
        
        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <h1 class="text-center">CREATE CLASS</h1>
                    <form method="post" action="Create_Class">
                        <div class="row">
                            <label for="" class="label control-label">SUBJECT</label>
                            <div class="col-md-10">
                                <input type="text" class="form-control" type="text" name="subject" id="subject" required>
                            </div>
                        </div>
    
                        <div class="row">
                            <label for="" class="label control-label">CODE</label>
                            <div class="col-md-10">
                                <input type="text" class="form-control" type="text" name="code" id="code" required>
                            </div>
                        </div>
    
                        <div class="row">
                            <label for="" class="label control-label">SECTION</label>
                            <div class="col-md-10">
                                <input class="form-control" type="text" name="section" id="section" required>
                            </div>
                        </div>

                        <button class="btn btn-outline-light" type="submit">CREATE</button>
                    </form>

                    <div class="row">
                        <div class="col-md-10">
                            <a href="DashBoard.jsp" class="btn btn-primary btn-outline-lg active" role="button" aria-pressed="true">Home</a>
                        </div>
                    </div>

                </div>
            </div>
        </div>

        <script src="./assets/js/bootstrap.min.js"></script>
        <script src="./assets/js/jquery.min.js"></script>
    </body>
</html>