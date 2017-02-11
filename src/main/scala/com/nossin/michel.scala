package com.nossin

import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.constructor.Constructor
import scala.collection.mutable.ListBuffer
import scala.beans.BeanProperty


object main {

	val text = """
  accountName: Ymail Account
  username: michel
  password: mysecret
  mailbox: INBOX
  imapServerUrl: imap.mail.yahoo.com
  protocol: imaps
  minutesBetweenChecks: 13
  usersOfInterest: [barney, betty, wilma]
  """

	def main(args: Array[String]) {
		val yaml = new Yaml(new Constructor(classOf[EmailAccount]))
		val e = yaml.load(text).asInstanceOf[EmailAccount]
		println(e)
	}

}

/**
	* With the Snakeyaml Constructor approach shown in the main method,
	* this class must have a no-args constructor.
	*/
class EmailAccount {
	@BeanProperty var accountName: String = null
	@BeanProperty var username: String = null
	@BeanProperty var password: String = null
	@BeanProperty var mailbox: String = null
	@BeanProperty var imapServerUrl: String = null
	@BeanProperty var minutesBetweenChecks: Int = 0
	@BeanProperty var protocol: String = null
	@BeanProperty var usersOfInterest = new java.util.ArrayList[String]()

	override def toString: String = {
		return accountName + ", user " + username + " has " + minutesBetweenChecks + " minutes between checks"
	}
}