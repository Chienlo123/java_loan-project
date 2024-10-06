-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2022 at 08:37 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `loan`
--

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

CREATE TABLE `details` (
  `Times` varchar(50) NOT NULL,
  `Cus_Name` varchar(50) NOT NULL,
  `Item_Type` varchar(50) NOT NULL,
  `Item_Price` varchar(50) NOT NULL,
  `Down_Payment` varchar(50) NOT NULL,
  `Loan_Balance` varchar(50) NOT NULL,
  `Payment` varchar(50) NOT NULL,
  `Due_Amount` varchar(50) NOT NULL,
  `Datee` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`Times`, `Cus_Name`, `Item_Type`, `Item_Price`, `Down_Payment`, `Loan_Balance`, `Payment`, `Due_Amount`, `Datee`) VALUES
('16:48:08', 'Angel Jude Suarez', 'Appliances', '10000', '5000', '5000', '5000', '0', '2022-03-31');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
