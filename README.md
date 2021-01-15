#AWS RDS demo project

Simple project with 3 options api (findAll, findByName, save) for some Book model. It's using postgres deployer on AWS RDS as db.

Short guide for creating rds instance:
![img.png](img.png)
![img_1.png](img_1.png)
![img_2.png](img_2.png)
![img_3.png](img_3.png)
![img_4.png](img_4.png)
![img_5.png](img_5.png)

after creating we should open db page and configure accesses:
![img_6.png](img_6.png)
![img_7.png](img_7.png)


##Elastic beanstalk
Another way to create rds instance and bind it with application - elastic beanstalk:
![img_8.png](img_8.png)
![img_9.png](img_9.png)
![img_10.png](img_10.png)
![img_11.png](img_11.png)
![img_12.png](img_12.png)
![img_13.png](img_13.png)

Example of two db created by different ways (pure rds and beanstalk):
![img_14.png](img_14.png)