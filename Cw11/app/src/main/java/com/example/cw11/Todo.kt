package com.example.cw11

class Todo(content:String,priority:Priority){
    private var content ="";
    private var priority:Priority;

    init {
        this.content = content;
        this.priority = priority;
    }
    public var Content:String
        get() {
            return content;
        }
        set(value){
            content = value.toString().trim()
        }

    public override fun toString(): String {
        return "$content | ${priority}"
    }

    public var Priority:Priority
        get() {
            return priority;
        }
        set(value){
            priority = value
        }
}

enum class Priority(var info:String){
    LOW ("niski"),
    MID ("średni"),
    HIGH ("wysoki"),
    NOW ("najwyzszy");

    override fun toString(): String {
        return info;
    }
}