package com.progress.backend.constraints;

public class StaticConstraints {

    public static String USER_FACADE_LOOKUP = "server-ear/server-ejb-1.0/userFacadeRemote!com.project.interfaces.UserFacadeRemote";

    public static String URL_PKG_PREFIXES = "org.jboss.ejb.client.naming";
    public static String INITIAL_CONTEXT_FACTORY = "org.jboss.naming.remote.client.InitialContextFactory";
    public static String PROVIDER_URL_FRIST_NODE = "http-remoting://127.0.0.1:8080";
    public static String SECURITY_PRINCIPAL_FRIST_NODE = "armdev";
    public static String SECURITY_CREDENTIALS_FIRST_NODE = "jboss2050";

}

//java:global/server-ear/server-ejb-1.0/userFacadeRemote!com.project.interfaces.UserFacadeRemote
//	java:app/server-ejb-1.0/userFacadeRemote!com.project.interfaces.UserFacadeRemote
//	java:module/userFacadeRemote!com.project.interfaces.UserFacadeRemote
//	java:jboss/exported/server-ear/server-ejb-1.0/userFacadeRemote!com.project.interfaces.UserFacadeRemote
//	java:global/server-ear/server-ejb-1.0/userFacadeRemote
//	java:app/server-ejb-1.0/userFacadeRemote
//	java:module/userFacadeRemote