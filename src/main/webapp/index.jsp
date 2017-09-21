<html>
<title>Holdings</title>
<body>
<form action="holdings" method="get">
    <table border="2px" , bgcolor="aqua" , align="center" , width="100%">
        <tr>
            <td>
                <button name="sortBy" value="name" >Name</button>
            </td>
            <td>
                <button name="sortBy" value="replenishment">Possibility of replenishment</button>
            </td>
            <td>
                <button name="sortBy" value="interestPayment">Interest payment</button>
            </td>
            <td>
                <button name="sortBy" value="term">Term</button>
            </td>
            <td>
                <button name="sortBy" value="annualRate">AnnualRate</button>
            </td>
        </tr>
        ${holdingsTable}
    </table>
</form>
</body>
</html>
