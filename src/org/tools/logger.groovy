package org.tools

def debug(message) {
    printColorMessage(message)
}

def info(message) {
    printColorMessage(message)
}

def error(message) {
    printColorMessage(message)
}

// jenkis 需要安装 ansicolor 插件
def printColorMessage(message, color) {
    colors = ['red'   : "\033[40;31m ERROR ${message} \033[0m",
              'blue'  : "\033[47;34m ${message} \033[0m",
              'green' : "[1;32m message [m",
              'green1' : "\033[40;32m  ${message} \033[0m" ]
    ansiColor('xterm') {
        println(colors[color])
    }
}
