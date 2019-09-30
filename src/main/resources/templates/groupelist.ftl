<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<h3>Groupe list</h3>
<br>
<div>

    <table class="table table-striped table-dark" border = "3">

        <tr class="bg-warning">


            <th>№</th>
            <th>Name</th>
            <th>Curator</th>
            <th>delete</th>


        </tr>

        <#list grupes as grupe>
            <tr>
                <td>${grupe.id}</td>
                <td>${grupe.name}</td>
                <td>${grupe.curator}</td>
                <td><a href="/groupe/delete/${grupe.id}"/>delete</td>

            </tr>
        </#list>

    </table>

</div>

<a href="/student/add">Add new group</a>


</body>
</html>