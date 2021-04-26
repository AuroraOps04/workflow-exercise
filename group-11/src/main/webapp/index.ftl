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
    <style>
        .tree li {
            list-style-type: none;
            cursor: pointer;
        }

        table tbody tr:nth-child(odd) {
            background: #F4F4F4;
        }

        table tbody td:nth-child(even) {
            color: #C00;
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
    <div class="row">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="glyphicon glyphicon-th"></i> 图书管理系统</h3>
                </div>
                <div class="panel-body">
                    <div class="form-inline" role="form" style="float:left;">
                    </div>
                    <button type="button" class="btn btn-primary"
                            onclick="window.location.href='/toRecommend.html'"><i class="glyphicon"></i>
                        好书推荐
                    </button>
                    <button type="button" class="btn btn-primary" style="float:right;"
                            onclick="window.location.href='/toAdd.html'"><i class="glyphicon glyphicon-plus"></i>
                        新增
                    </button>
                    <br>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <table class="table  table-bordered">
                            <thead>
                            <tr>
                                <th>书名</th>
                                <th>isbn</th>
                                <th>作者</th>
                                <th>价格</th>
                                <th width="100">操作</th>
                            </tr>
                            </thead>
                            <tbody id="tbody">
                            <#list book as b>
                                <tr>
                                    <td class="userid">${b.name}</td>
                                    <td>${b.isbn?c}</td>
                                    <td>${b.author}</td>
                                    <td>${b.price}</td>
                                    <td>
                                        <button onclick="window.location.href ='/toEdit.html?id=${b.id}'"
                                                type="button" class="btn btn-primary btn-xs">
                                            <i class=" glyphicon glyphicon-pencil"></i>
                                        </button>
                                        <button onclick="window.location.href ='/delete.html?id=${b.id}'"
                                                type="button" class="btn btn-danger btn-xs">
                                            <i class=" glyphicon glyphicon-remove"></i>
                                        </button>
                                    </td>
                                </tr>
                            </#list>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="/jquery/jquery-2.1.1.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
