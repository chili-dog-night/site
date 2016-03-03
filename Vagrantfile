# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|
  config.vm.box = "ubuntu/wily64"

  # Networking
  config.vm.network :forwarded_port, guest: 3000, host: 3000
  config.vm.network :forwarded_port, guest: 5432, host: 5432

  config.vm.provider "virtualbox" do |v|
    v.name = "chili-dog-night"
    v.memory = 1024
  end

  config.vm.provision :shell, path: "provision.sh"
end
