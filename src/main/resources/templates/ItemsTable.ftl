<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
          crossorigin="anonymous">
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<h3>Item list</h3>
<br>
<div>

    <table class=table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Description</th>
            <th>Created</th>
            <th>Modified</th>
        </tr>
        </thead>
        <tbody>
        <#list items as element>   <#--цикл по всім element-->
            <#-- для кожного element у списку items, який ми получили з контроллера, формуємо строку tr.
             У цієї строки є 5 кліток являється полем елементу(id, name,...)-->

            <tr>
                <td>${element.id}</td>
                <td>${element.name}</td>
                <td>${element.description}</td>
                <td>${element.created_at}</td>
                <td>${element.modified_at}</td>
            </tr>
        </#list>
        </tbody>

    </table>

</div>


</body>
</html>