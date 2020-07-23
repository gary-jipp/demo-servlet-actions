package startup;

import java.net.UnknownHostException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import common.LogHelper;

/**
 * Called on server startup. Initializes context<br>
 * Doesn't do anything exciting, just saves "instance" to servletContext and
 * setup log4j logging
 */
public class ContextListener implements ServletContextListener {
  private Logger logger;

  @Override
  public void contextInitialized(ServletContextEvent event) {
    ServletContext servletContext = event.getServletContext();

    // Set the root name for log4j logging
    LogHelper.setLogRoot("demo");

    this.logger = LogHelper.getLogger(getClass());
    String instance = servletContext.getRealPath("/");
    logger.info("ContextListener starting: instance=" + instance);

    // Save to servletContext so all servlets can access leter if needed
    servletContext.setAttribute("instance", instance);

    logger.info("ContextListener complete");
  }

  /**
   * Get Host name of app server
   * 
   * @param logger
   * @return
   */
  public static String getHostname(Logger logger) {
    try {
      String hostname = java.net.InetAddress.getLocalHost().getCanonicalHostName();
      return hostname;
    }
    catch (UnknownHostException e) {
      logger.error(e.getMessage());
      return null;
    }
  }

  @Override
  public void contextDestroyed(ServletContextEvent event) {
    logger.info("Stopping ContextListener");

    // Here we might want to release any database drivers loaded, etc

    logger.info("ContextListener Stopped");
  }
}