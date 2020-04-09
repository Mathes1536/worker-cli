# Sandbox Runtime

[Sandbox](https://getsandbox.com) is a platform to quickly and easily create or generate web service mocks, with instant deploy, collaborative build, and debugging tools for API developers. [More info - https://getsandbox.com](https://getsandbox.com)

Sandbox Runtime is the core processing component of the Sandbox product, it is responsible for executing HTTP requests against your definition files (main.js etc) and templates (template.liquid) to produce a response. 

This project consists of both the core runtime code, and a lightweight wrapper to simplify command line use. The compiled version is around 10mb and can be run on mac and linux. 

**Note**: Gradle 2.14+ is required to build this yourself, if not using the pre-built binary.

## Installation

The code can be cloned and compiled by itself (Gradle is used for dependency management) or you can just download the compiled and packaged binary which can be run from the command line on a supported OS.

[Latest compiled binary](https://github.com/getsandbox/sandbox/releases)

### Dependencies

* _Java 8 Update 72_ or later
* tar - is packaged in tar to maintain permissions, so `tar -xf sandbox-binary.tar`
* Mac or Linux

### Operating System
The runtime is Java based, so it will run on any OS that Java 8 supports. The precompiled binary ships as a bash script + binary, so it is self executable only on \*nix systems.

### Installation
There is no installation, but to get setup:
- Download the latest binary from above, and untar it.
- Install Java 8, and any other dependencies listed.
- Your shouldn't have to change the permissions (thats the point of thar tar), but if you can `chmod a+x sandbox`
- Run with the below command and options `./sandbox run`
- The server will be running in all interfaces on port 8080 by default.


### Commands

The CLI currently supports one action `sandbox run` which will start the runtime with the base directory being the current directory.

```
Commands:
run      Starts a sandbox runtime in the current working directory.

Options:
--port=<port number>
--base=<base directory> (Overrides working directory)
--state=<file to persist state to> (Reads/writes a file to persist state across runs)
--runtimeVersion=VERSION_1|VERSION_2
--verbose (Increases logging verbosity, full request and response bodies etc)
```

**Note for Windows Users:** The above commands are for for *nix/mac operating systems that support shell scripts (the binary linked above is basically just a JAR file with a sh wrapper), so Windows users will have to run the standard Java start commands like:
```java -jar sandbox --port=8080 run```



## Getting Started

For a basic example checkout the `examples` directory, more detail is available on the Sandbox [Getting Started](https://getsandbox.com/docs/getting-started) and the [API Definition](https://getsandbox.com/docs/sandbox-api) pages.

## License

MIT
