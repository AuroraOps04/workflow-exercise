<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <link rel="stylesheet" href="/css/doc.min.css">
    <style>
        .tree li {
            list-style-type: none;
            cursor:pointer;
        }
        .container-fluid {
            padding-right: 174px;
            padding-left: 0px;
            margin-right: auto;
            margin-left: auto;
        }
    </style>
</head>

<body>


<div class="container-fluid">
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
        <div class="panel panel-default">
            <div class="panel-heading">修改图书信息<div style="float:right;cursor:pointer;" data-toggle="modal" data-target="#myModal"><i class="glyphicon glyphicon-question-sign"></i></div></div>
            <div class="panel-body">
                <form action="/edit">
                    <div class="form-group">
                        <label for="name">id</label>
                        <input type="hidden" class="form-control" name="id" value="${book.id}">
                    </div>
                    <div class="form-group">
                        <label for="name">书名</label>
                        <input type="text" class="form-control" name="name" value="${book.name}">
                    </div>
                    <div class="form-group">
                        <label for="isbn">isbn</label>
                        <input type="text" class="form-control" name="isbn" value=${book.isbn?c}>
                    </div>
                    <div class="form-group">
                        <label for="author">作者</label>
                        <input type="text" class="form-control" name="author" value="${book.author}">
                    </div>
                    <div class="form-group">
                        <label for="price">价格</label>
                        <input type="text" class="form-control" name="price" value="${book.price}">
                    </div>
                    <input type="submit" value="修改" class="btn btn-success">
                </form>
            </div>
    </div>
</div>
</div>
<script src="/jquery/jquery-2.1.1.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
