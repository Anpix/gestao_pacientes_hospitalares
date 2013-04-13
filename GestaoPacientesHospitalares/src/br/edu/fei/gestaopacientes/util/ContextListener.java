package br.edu.fei.gestaopacientes.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.lett.guteDAO.GuteDAO;


public class ContextListener implements ServletContextListener {
	
	static Logger logger = LogManager.getLogger(ContextListener.class.getName());
	
	public void contextInitialized(ServletContextEvent e) {
		
		logger.info(" | ContextListener called [contextInitialized]");
		logger.info(" | Setting up GestaoPacientesHospitalares app");
		logger.info(" | Calling guteDAO startup");
		try{
			new GuteDAO().startup();
		}catch(Exception daoe){
			daoe.printStackTrace();
		}
		logger.info(" | Done setting up GestaoPacientesHospitalares, we are up and running!\n");
	}

	public void contextDestroyed(ServletContextEvent e){
		logger.info(" | ContextListener called [contextDestroyed]");
		logger.info(" | Shutting down GestaoPacientesHospitalares app");
		logger.info(" | Calling guteDAO destroy");
		try{
			new GuteDAO().destroy();
		}catch(Exception daoe){
			daoe.printStackTrace();
		}
		logger.info(" | Done destroying app\n");
	}
}