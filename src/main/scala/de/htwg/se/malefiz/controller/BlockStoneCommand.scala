package de.htwg.se.malefiz.controller

import de.htwg.se.malefiz.Util.Command
import de.htwg.se.malefiz.model.Field

class BlockStoneCommand(field: Field, controller: ControllerInterface) extends Command {

  override def doStep(): Unit = {
    controller.gameBoard.setBlockStoneOnField(field)
  }

  override def undoStep(): Unit = {
    controller.gameBoard.removeBlockStoneOnField(field)
    controller.needToSetBlockStone = true
  }

  override def redoStep(): Unit = doStep()

}