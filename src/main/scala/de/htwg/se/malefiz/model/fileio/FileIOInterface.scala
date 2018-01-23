package de.htwg.se.malefiz.model.fileio

import de.htwg.se.malefiz.controller.{ ControllerInterface }

trait FileIOInterface {

  /**
    * Läd den gewspeicherten Spielstand
    * @param controller
    */
  def load(controller: ControllerInterface): Unit

  /**
    * Speichert den aktuellen Spielstand ab
    * @param controller
    */
  def save(controller: ControllerInterface): Unit
}
