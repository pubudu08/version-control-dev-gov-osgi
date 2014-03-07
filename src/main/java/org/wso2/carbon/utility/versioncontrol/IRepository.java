package org.wso2.carbon.utility.versioncontrol;


/**
 * IIssueTracker is an interface for all Version Control related APIs
 * this will act as a pluggable api interface.
 * @author Pubudu Dissanayake : pubudud@wso2.com on 02/02/2014.
 */

public interface IRepository {

    /**
     * This method will returns artifact type
     * @return <code>vcs</code>
     */
	public String getRepositoryType();

    /**
     * This method will create a project which is related to vcs
     * @param username provide valid username for the API
     * @param password provide valid password for the API
     * @param repositoryPath repository path to create the project
     * @return <code>true</code> if the project gets created successfully
     */
	public boolean createRepository(String username, String password, String repositoryPath);

    /**
     *
     * @param username provide valid username for the API
     * @param password provide valid password for the API
     * @param repositoryPath repository path to create the project
     * @return <code>true</code> if provided project already exists
     */
	public boolean isRepositoryExist(String username, String password,  String repositoryPath);

}
