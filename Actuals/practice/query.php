<?php
	$Reservation_Num = $_POST['Reservation_Num'];
	$Seat_Count = $_POST['Seat_Count'];
	$Pax = $_POST['Pax'];
	$StudPurpose = $_POST['Stud_Purpose'];
	echo"$Reservation, $Seat Count, $Pax, $Stud Purpose

	$conn = new mysqli('localhost','root','',reservation details');
if($conn->connect_error) 
    {
      die('Connection Failure : ' .$conn->connect_error);
        }else{
	 $stmt = $conn->prepare("insert into reservation details(Reservation_Num, Seat_Count, Pax , Stud_Purpose)
	values(?,?,?,?)");
	$stmt->bind_param("siis", $Reservation_Num, $Seat_Count, $Pax, $Seat_Count);
    $stmt->execute();
	echo "Information Complete"
	$stmt->close();
	$conn->close();
    }
?>
