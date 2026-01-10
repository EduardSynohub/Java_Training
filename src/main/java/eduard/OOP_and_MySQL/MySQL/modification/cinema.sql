DROP DATABASE IF EXISTS cinemas_ex;
CREATE DATABASE cinemas_ex
    DEFAULT CHARACTER SET utf8
    COLLATE utf8_unicode_ci;
USE cinemas_ex;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `cinemas_ex`
--

-- --------------------------------------------------------

--
-- Table structure for table `cinemas`
--

CREATE TABLE `cinemas` (
    `id` int(11) NOT NULL,
    `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
    `address` text COLLATE utf8_unicode_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `cinemas`
--

INSERT INTO `cinemas` (`id`, `name`, `address`) VALUES
    (1, 'Luna', 'Marszalkowska Street 28'),
    (2, 'Silver Screen Pulawska', 'Europlex Center - Pulawska Street 17'),
    (3, 'Iluzjon National Film Archive', 'Narbutta Street 50a'),
    (4, 'Ethno Cinema', 'Kredytowa Street 1, Warsaw'),
    (5, 'Multikino Zlote Tarasy', 'Zlota Street 59'),
    (6, 'Kinoteka', 'Defilad Square 1'),
    (7, 'Cinema City Promenada', 'Ostrobramska Street 75C'),
    (8, 'Praha', 'Jagiellonska Street 26'),
    (9, 'Alchemia', 'Jezuicka Street 4'),
    (10, 'Muranow', 'Zamenhofa Street 1'),
    (11, 'Femina', 'Solidarnosci Avenue 115');

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE `movies` (
    `id` int(11) NOT NULL,
    `title` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
    `description` text COLLATE utf8_unicode_ci,
    `rating` decimal(4,2) DEFAULT '0.00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`id`, `title`, `description`, `rating`) VALUES
    (1, 'Insurgent (2015)', 'Beatrice Prior confronts her inner demons and continues her fight against a powerful alliance that threatens to destroy society.', '7.00'),
    (2, 'Sex, Love and Therapy (2014)', 'Lambert, a sex addict trying to overcome his addiction, hires a constantly unsatisfied nymphomaniac.', '5.00'),
    (3, 'Ex Machina (2015)', 'After winning a competition, a programmer from a major internet company is invited to his CEO’s estate, where he becomes part of a secret experiment.', '8.00'),
    (4, 'Clouds of Sils Maria (2014)', 'A renowned actress rediscovers herself during a few days spent in the Alps with her assistant.', '7.21'),
    (5, 'Chappie (2015)', 'Two gangsters steal a police android to use it for their own purposes.', '8.32'),
    (6, 'Cinderella (2015)', 'After her father’s death, Ella is turned into a servant by her cruel stepmother. Her fate changes thanks to the Fairy Godmother.', '8.00'),
    (7, 'Neighbors (2014)', 'A priest visits an apartment building during Christmas blessings, uncovering the secrets of its residents.', '3.15'),
    (8, 'The Golden Dream (2013)', 'Sara, a teenage girl from Guatemala, embarks on a dangerous journey to Los Angeles in search of a better life.', '9.00'),
    (9, 'Body (2015)', 'A cynical prosecutor and his anorexic daughter try to cope after the tragic death of a loved one.', '6.00'),
    (10, 'Fru! (2014)', 'A bird that has never left its nest accidentally becomes the guide of a flock.', '5.00'),
    (11, 'Disco Polo (2015)', 'Young musicians from the countryside quickly rise to the top of the music charts.', '2.00'),
    (12, 'Asterix: The Mansions of the Gods (2014)', 'Julius Caesar decides to build a residential district for Roman citizens and names it The Mansions of the Gods.', '9.00');

-- --------------------------------------------------------

--
-- Table structure for table `payments`
--

CREATE TABLE `payments` (
    `id` int(11) NOT NULL,
    `type` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
    `payment_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `payments`
--

INSERT INTO `payments` (`id`, `type`, `payment_date`) VALUES
    (1, 'cash', '2025-02-18'),
    (2, 'bank transfer', '2025-02-18'),
    (3, 'bank transfer', '2025-02-18'),
    (4, 'unknown', '2025-05-24'),
    (5, 'card', '2026-01-09');

-- --------------------------------------------------------

--
-- Table structure for table `tickets`
--

CREATE TABLE `tickets` (
    `id` int(11) NOT NULL,
    `quantity` int(11) NOT NULL DEFAULT '0',
    `price` decimal(5,2) NOT NULL DEFAULT '0.00',
    `status` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tickets`
--

INSERT INTO `tickets` (`id`, `quantity`, `price`, `status`) VALUES
    (1, 103, '37.40', 0),
    (2, 220, '24.99', 0),
    (3, 56, '42.00', 0),
    (4, 402, '17.21', 0),
    (5, 105, '28.32', 0),
    (6, 700, '20.50', 0),
    (7, 307, '23.15', 0),
    (8, 99, '49.50', 0),
    (9, 601, '36.00', 0),
    (10, 444, '25.50', 0),
    (11, 123, '21.90', 0),
    (12, 208, '19.90', 0);

-- --------------------------------------------------------

--
-- Indexes
--

ALTER TABLE `cinemas`
    ADD PRIMARY KEY (`id`);

ALTER TABLE `movies`
    ADD PRIMARY KEY (`id`);

ALTER TABLE `payments`
    ADD PRIMARY KEY (`id`);

ALTER TABLE `tickets`
    ADD PRIMARY KEY (`id`);

-- --------------------------------------------------------

--
-- AUTO_INCREMENT
--

ALTER TABLE `cinemas`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

ALTER TABLE `movies`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

ALTER TABLE `payments`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

ALTER TABLE `tickets`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
