CREATE TABLE `orcamentos_ti`.`orcamentos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `profissional_nome` VARCHAR(45) NULL,
  `total_horas` DECIMAL(10,2) NULL,
  `custo_final` DECIMAL(10,2) NULL,
  PRIMARY KEY (`id`));