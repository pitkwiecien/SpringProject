-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 07, 2022 at 09:43 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

-- Database resetting - dropping optional old database
DROP DATABASE IF EXISTS shop3tc1;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shop3tc1`
--
CREATE DATABASE IF NOT EXISTS `shop3tc1` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `shop3tc1`;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `price` float(6,0) DEFAULT NULL,
  `category` int(2) DEFAULT NULL,
  `description` varchar(10000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `price`, `category`, `description`) VALUES
(1, 'bread', 5, 1, 'bread (good)'),
(2, 'butter', 10, 1, 'butter for vegans (for flag)'),
(3, 'water', 1, 2, 'bottle of water containing 500ml of this precious liquid');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(6) NOT NULL,
  `name` varchar(6) DEFAULT NULL,
  `surname` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `role` int(2) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `surname`, `email`, `role`, `password`) VALUES
(1, 'Seba', 'Proch', 'ghjhgproch@gmail.com', 1, 'gfd$@'),
(2, 'pola', 'jdbc', 'johnoch@gmail.com', 2, '12af'),
(3, 'pola', 'szpola', 'diastemah@gmail.com', 3, '1111'),
(4, 'kbau', 'adam', 'diast124mah@gmail.com', 3, '1231'),
(5, 'Peter', 'April', 'peter.april@gmail.com', 1, 'sweetju1ce'),
(6, 'Michae', 'Witkowski', 'michael.witkowski@gmail.com', 2, 'i8mracist'),
(7, 'Jhon', 'Arm', 'john.arm@gmail.com', 1, 'qazwsx');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
