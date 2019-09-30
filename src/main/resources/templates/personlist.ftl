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

<h3>Person list</h3>
<br>
<div>

    <table class="table table-striped table-dark" border = "3">

        <tr class="bg-warning">


            <th>№</th>
            <th>Name</th>
            <th>Age</th>
            <th>delete</th>


        </tr>

        <#list persons as person>
            <tr>
                <td>${person.id}</td>
                <td>${person.name}</td>
                <td>${person.age}</td>
                <td><a href="/person/delete/${person.id}"/>delete</td>

            </tr>
        </#list>

    </table>

</div>

<a href="/student/add">Add new group</a>


</body>
</html>