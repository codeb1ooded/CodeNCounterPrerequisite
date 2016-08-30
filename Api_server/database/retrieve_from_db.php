<?php
  include 'config_database.php';

  // mysqli references : http://www.w3schools.com/php/php_ref_mysqli.asp

  function storeData($data){

    // put your database query here created using function params
    $query = "";

    // For successful SELECT, SHOW, DESCRIBE, or EXPLAIN queries it will return a mysqli_result object.
    // For other successful queries it will return TRUE, FALSE on failure
    $result = mysqli_query ($con, $query);
    
  }

?>
