package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

	def index = Action {
		Ok("Working hard or hardly working...")
	}

	def test = Action {
		Ok("Testing...")
	}

}