<?php
	define ($DB_HOST, "localhost");
	define ($DB_USERNAME, "root");
	define ($DB_PASSWORD, "");
	// Enter the database name here
	define ($DB_NAME, "");

	$con = mysqli_connect($DB_HOST, $DB_USERNAME, $DB_PASSWORD);
	if (!$con) {
		die ('Could not connect: ' . mysqli_error());
	}
	$db = mysqli_select_db ($con, $DB_NAME);
	if (!$db)
		echo " Connection to the database failed ";
?>
