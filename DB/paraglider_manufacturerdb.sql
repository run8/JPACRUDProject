-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema paraglider_manufacturerdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `paraglider_manufacturerdb` ;

-- -----------------------------------------------------
-- Schema paraglider_manufacturerdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `paraglider_manufacturerdb` DEFAULT CHARACTER SET utf8 ;
USE `paraglider_manufacturerdb` ;

-- -----------------------------------------------------
-- Table `manufacturer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manufacturer` ;

CREATE TABLE IF NOT EXISTS `manufacturer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `company_name` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `year_founded` INT NOT NULL,
  `description` VARCHAR(1000) NOT NULL,
  `url` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS paraglider@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'paraglider'@'localhost' IDENTIFIED BY 'password';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'paraglider'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `manufacturer`
-- -----------------------------------------------------
START TRANSACTION;
USE `paraglider_manufacturerdb`;
INSERT INTO `manufacturer` (`id`, `company_name`, `country`, `year_founded`, `description`, `url`) VALUES (1, 'Ozone', 'France', 1998, 'Ozone Gliders Limited is an aircraft manufacturer based in Le Bar-sur-Loup, France, although it is registered in Edinburgh, Scotland. The company specializes in the design and manufacture of paragliders in the form of ready-to-fly aircraft.', 'https://www.flyozone.com/');
INSERT INTO `manufacturer` (`id`, `company_name`, `country`, `year_founded`, `description`, `url`) VALUES (2, 'Advance Thun SA', 'Switzerland', 1988, 'The company is one of the world\'s leading manufacturers of paragliders. They produce a full line of paragliders ranging from training to competition gliders. Many of their glider models have been developed over successive generations of refinements. Gliders include the beginner Advance Alpha, the intermediate Epsilon and Sigma as well as the competition Omega and the two-place Advance Bi Beta.', 'https://www.advance.swiss/');
INSERT INTO `manufacturer` (`id`, `company_name`, `country`, `year_founded`, `description`, `url`) VALUES (3, 'Airwave Gliders', 'Austria', 1979, 'Airwave Gliders was an Austrian aircraft manufacturer based in Fulpmes. The company specialized in the design and manufacture of hang gliders and paragliders.', 'https://www.airwave-gliders.com/');
INSERT INTO `manufacturer` (`id`, `company_name`, `country`, `year_founded`, `description`, `url`) VALUES (4, 'Apco Aviation', 'Israel', 1982, 'Apco Aviation (usually styled APCO), is an Israeli aircraft manufacturer based in Caesarea and founded in 1982 by Anatoly Cohn. The company specializes in the design and manufacture of paragliders and at one time also made hang gliders and ultralight aircraft. It also manufacturers paraglider harnesses, the Mayday line of parachute rescue systems and other accessories.', 'http://www.apcoaviation.com/');
INSERT INTO `manufacturer` (`id`, `company_name`, `country`, `year_founded`, `description`, `url`) VALUES (5, 'Axis', 'Czech Republic', 1998, 'The company was founded in 1979 and went out of business circa 2009.[2][3] As of 2019, the Airwave website still exists, but it just refers visitors to Bruce Goldsmith Design for support for Airwave products.', 'https://axispara.cz/');
INSERT INTO `manufacturer` (`id`, `company_name`, `country`, `year_founded`, `description`, `url`) VALUES (6, 'Gin Gliders', 'South Korea', 1998, 'Gin Gliders was formed in 1998 by paraglider designer and competition pilot Gin Seok Song and his team of engineers and test pilots.The “GIN Team” has dominated the Paragliding World Cup every year since 1998, and has had countless other competition successes in World Cups, World and National Championships. This high level of expertise provided by dedicated professionals ensures that you get the best possible product support and after sales service.', 'https://www.gingliders.com/en');
INSERT INTO `manufacturer` (`id`, `company_name`, `country`, `year_founded`, `description`, `url`) VALUES (7, 'Dudek Paragliding', 'Poland', 1995, 'Dudek Paragliders is a manufacturer of the highest quality wings for paragliding and paramotoring reviews. Our full range of products – from school to competition level paragliders – puts Dudek at the top of the list for many pilots. All our products are manufactured in Poland (European Union), making Dudek one of the few factories that doesn’t outsource production to other countries.', 'https://www.dudek.eu/en/paragliders/');

COMMIT;

