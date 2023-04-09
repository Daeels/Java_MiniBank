-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 16 juin 2020 à 16:25
-- Version du serveur :  8.0.18
-- Version de PHP :  7.4.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `db_banque`
--

-- --------------------------------------------------------

--
-- Structure de la table `compte_courant`
--

DROP TABLE IF EXISTS `compte_courant`;
CREATE TABLE IF NOT EXISTS `compte_courant` (
  `id_compte` int(11) NOT NULL AUTO_INCREMENT,
  `num_compte` int(11) NOT NULL,
  `nom` varchar(255) COLLATE utf8_unicode_520_ci NOT NULL,
  `solde` float NOT NULL,
  PRIMARY KEY (`id_compte`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_520_ci;

--
-- Déchargement des données de la table `compte_courant`
--

INSERT INTO `compte_courant` (`id_compte`, `num_compte`, `nom`, `solde`) VALUES
(1, 1, 'Hassan', 2800.5),
(3, 2, 'Hamid', 1400),
(5, 508, 'Hajar', 2100);

-- --------------------------------------------------------

--
-- Structure de la table `compte_remunere`
--

DROP TABLE IF EXISTS `compte_remunere`;
CREATE TABLE IF NOT EXISTS `compte_remunere` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num` int(255) NOT NULL,
  `nom` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `solde` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

--
-- Déchargement des données de la table `compte_remunere`
--

INSERT INTO `compte_remunere` (`id`, `num`, `nom`, `solde`) VALUES
(1, 66, 'Rachid', 7001.505),
(3, 77, 'Jamal', 4000.44),
(4, 11, 'Amine', 600.6),
(5, 55, 'Khalid', 5297.25),
(9, 10, 'Karim', 1200.2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
