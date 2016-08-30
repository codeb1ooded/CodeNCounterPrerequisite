<?php
  include 'config_database.php';

  // mysqli references : http://www.w3schools.com/php/php_ref_mysqli.asp

  function retreiveData(){

    // put your database query here
    $query = "";

    // For successful SELECT, SHOW, DESCRIBE, or EXPLAIN queries it will return a mysqli_result object.
    // For other successful queries it will return TRUE, FALSE on failure
    $result = mysqli_query ($con, $query);

    // The mysqli_fetch_assoc() function fetches a result row as an associative array.
    // Parameter : $res, Required. Specifies a result set identifier returned by mysqli_query(), mysqli_store_result()
    // or mysqli_use_result()
    // Returns an associative array of strings representing the fetched row. NULL if there are no more rows in result-set
    while ($r = mysqli_fetch_assoc ($result)){
      // $r will get each row from $result one by one till it has rows
    }
  }

?>
