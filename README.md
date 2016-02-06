# chili-dog-night

An entity that will never forget.

## Setup 

Download and install [VirtualBox](https://www.virtualbox.org/wiki/Downloads), and [Vagrant](https://www.vagrantup.com/). Then provision a virtual machine with the following commands...

```bash
cd chili-dog-night
vagrant up
```

This will create a new virtual machine, and provision that machine with appropriate development dependency software. This can take some time so be patient.

## Run

Assuming you have already brought up your virtual machine with Vagrant, and are in the root directory of this project, type the following commands...

```bash
vagrant ssh
cd /vagrant
boot dev
```

If everything went according to plan you can view the site at [http://localhost:3000](http://localhost:3000).

## Deploy

Assuming you have used SSH and are connected to the virtual machine, you can set up the [Heroku Toolbelt](https://toolbelt.heroku.com/debian) from the prompt via...

```bash
heroku login
```
