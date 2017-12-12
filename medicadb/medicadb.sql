-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Φιλοξενητής: 127.0.0.1
-- Χρόνος δημιουργίας: 12 Δεκ 2017 στις 17:14:13
-- Έκδοση διακομιστή: 10.1.28-MariaDB
-- Έκδοση PHP: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Βάση δεδομένων: `medicadb`
--

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `patientinfo`
--

CREATE TABLE `patientinfo` (
  `Name` varchar(255) DEFAULT NULL,
  `Surname` varchar(255) DEFAULT NULL,
  `AMKA` varchar(255) DEFAULT NULL,
  `Carrier` varchar(255) DEFAULT NULL,
  `Birthdate` varchar(255) DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `TK` varchar(255) DEFAULT NULL,
  `City` varchar(255) DEFAULT NULL,
  `Phone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Άδειασμα δεδομένων του πίνακα `patientinfo`
--

INSERT INTO `patientinfo` (`Name`, `Surname`, `AMKA`, `Carrier`, `Birthdate`, `Address`, `TK`, `City`, `Phone`) VALUES
('Γιάννης', 'Κυριαζόπουλος', '123456789', 'ΙΚΑ', 'tht', 'Θηβων 2', '44356', 'Αθήνα', '6982356898'),
('ergwerg', 'wergw', 'wergw', 'wergw', 'werg', 'wreg', 'wergw', 'werg', 'wgerg');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `users`
--

CREATE TABLE `users` (
  `Username` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Άδειασμα δεδομένων του πίνακα `users`
--

INSERT INTO `users` (`Username`, `Password`, `ID`) VALUES
('kyriazo', '44346', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
