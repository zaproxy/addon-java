# ZAP Template Java Add-on

A template repo for a 3rd party [ZAP](https://www.zaproxy.org) Java add-on.

If you'd like to create your own ZAP add-on which could be published to the [ZAP Marketplace](https://www.zaproxy.org/addons/) then copy this repo and make the following changes:

1. Rename the `youruser` directories to be your github name (or choose another package hierarchy which works better for you).

1. Change the add-on ID `addonjava` to be a new ID which is not already on the [ZAP Marketplace](https://www.zaproxy.org/addons/).

1. Change the code and help files to do whatever you want :smiley:

1. Deploy and test your app locally, e.g. using `./gradlew copyZapAddon`

1. Optional: Raise an [Issue](https://github.com/zaproxy/zaproxy/issues/new?assignees=&labels=marketplace&template=third-party-addon.yml) to get your add-on published on the [ZAP Marketplace](https://www.zaproxy.org/addons/).

For more info on developing ZAP add-ons see https://www.zaproxy.org/docs/developer/