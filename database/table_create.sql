SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


--
-- Table structure for table `fit_file`
--

CREATE TABLE IF NOT EXISTS `fit_file` (
  `ID` int(10) UNSIGNED NOT NULL,
  `file_name` varchar(100) NOT NULL,
  `upload_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

COMMIT;


