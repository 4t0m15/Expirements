//RUST IN 30 min. (https://www.youtube.com/watch?v=br3GIIQeefY and https://fasterthanli.me/articles/a-half-hour-to-learn-rust)
//pre typesystems
let x; // declare x
x = 42; //assign 42 to x
let y = 42; // this can be made in a single line
let z = i32; //types can be annotated
z = 42;
let x: i32 = 42; //This can also be done in only one line
//other languages do this for you at runtime, yet that is inneficient
//rust stops you from accessing uninitialised variables
/*
let x;
foobar(x);
x = 42
THIS IS WRONG!!
C will crash, but rust wont
*/
/*
let x;
x = 42;
foobar(x);
THIS IS CORRECT!!
*/
//underscores are cool in rust, it ignores its result let _ = 42; does nothing, yet let _ = get_thing(); calls the function but does not store the value
//rust has touples, which is like an array, but with multiple types allowed.
//ex: let pair: (char, i32) = ('a', 17);
/*
let (some_char, some_int) = ('a', 17);
assert!(some_char, 'a');
assert!(some_int, 17);
let (l, r) = slice.split_at(middle);
let (_, right) = slice.split_at(middle); this returns a touple.
*/
//The semicolon marks the end of a statement.
let x = 3;
let y = 5;
let z = y + z;
/*
statements semicolons can span multiple lines
let x = vec![1,2,3,4,5,6,7,8]
.iter()
.map(|x| x + 3)
.fold(0, |x, y| x + y);
*/
// in rust, nearly everthing is a function
/*
fn greet(){
	println!("Hi there!");
}
f -> void (returns nothing)
fn fair_dice_roll() -> i32 {
	4
}
*/
/*
now shit starts to hit the fan,
let x = "out; {
let x = "in";
println!("{}", x);
}
println!("{}", x);
//this prints in, then out later on.
//this is due to odd scoping
}
The interior variable only lasts as long as the block itself.
*/
//BLOCKS THEMSELVES ARE EXPRESSIONS!
//This: let x = 42; is the same as this: let x = {42};
let x = {
	let y = 1;
	let z = 2;
	y + z // this is the "tail"
};
//This is infinetely better than java:
fn fair_dice_roll_2() -> i32 {
	return 4;
}
fn fair_dice_roll_3 -> i32 {
	4
}
//this is something im going to have to review later on, if conditions are also expressions
fn fair_dice_roll_4() -> i32 {
	if feeling_lucky {
		6
	} else {
		4
	}
}
//this is when I have no freaking idea what this guy is on about, a match is an expression, not a statement (yeah, sorry im not a genius)
fn fair_dice_roll_5() -> i32 {
	match feeling_lucky {
		true => 6,
		false => 4,
	}
}
//Dots are usually used to acess fields of a value:
//let a = (10, 20);
//a.0; // == 10
//let amos = get_some_struct();
//amos.nickname; // "fasterthanlime"
//let nick = "fasterthanlime;"
//nick.len(); // this is 14.
// this is like "c style" languages
// The double colon is similar but acts on "namespaces" (whatever that is)
//This is approximately let least = std::cmp::min(3,8);
//crate::file::function this apparentely provides "great clarity"
// now this is making sense,
/*
use std::cmp::min;
let least = min(7,1); // this is 1
//so much better than the slop oracle makes
//rust has strict scoping rules
*/
/*
let x = "amos".len(); // 4
let x = str::len("amos");  // this is 4 aswell
//str is a primitive
// but strangely other, non primitives are in scope aswell.
//ahh shit, type system incomming.
*/
//POST typesystems
//structs are declared with the struct ketword
//struct Number {
/*
odd: bool;
value: i32;
//They can be made with literals
let x = Number { odd: false, value: 2};
let y = Number { value: 3, odd: true};
}*/
//from what I looked at online, structs are just the different names for objects
//fn print_number(n: Number) {
/*
	match n.value {
		1 => println!("One"),
		2 => println!("Two"),
		_ => println!("{}", n.value),
	}
)


//alight yeah idk wtf ts is*/	
/*
struct Number {
	odd: bool,
	value: i32,
}
//you can declare methods on your own types
//EX:
impl Number {
	fn is_positive(self) -> bool {
		self.value > 0
	}
}
//Both these methods are usable, isn't that super cool?
let minus_two = Number {
	odd: false,
	value: -2,
};
println!("{}", minus_two.is_positive());*/
//variable bindings are immutable by default, you need to use the mut keyword
/*
//Trying to change a value that is not set as mut will result in an error
//EX: 
let n = Number {
	odd: true;
	value: 17;	
};
n.odd = false;
// if you write this code rust will tell you to fuck yourself
//this also means that they cant be assigned to other things.
/*
fn main() {
	let mut n = Number {
		odd: true,
		value: 17,
	}
	n.value = 19; // this is a-okay.
}*/
//this is like in pascal
*/
//this is unlike other c based/like languages like in java where you have to do const to have it be immutable
//Rust is based i guess idk what the guy is on about here.
/*
functions can be generic:
fn foobar<T>(arg T){
	//will work with 'arg'
}
//whats cool is that you can have multiple type parameters
fn foobar<L, R>(left: L, right: R ) {
	//will work with both 'left' and 'right' type things
}
/*
structs can be generic aswell.
struct Pair<T> {
	a: T,
	b: T,
}
let p1 = Pair {a: 3, b: 9};
let p2 = Pair {a: true, b: false };
The standard value type vec is a heap allocated array 
let mut v1 = Vec::new();
v1.push(1);
let mut v2 = Vec::new();
v2.push(false);
//v1 == Vec<i32> //vector of booleans
//v2 == Vec<bool> //vector of integers
//rust does this cool thing where it will make a new array at runtime if the current one is too big.
//vec comes with a macro (I need to figure out wth that is lol that basically gives us vector literals)

//fn main() {
	let v1 = vec![1,2,3];
	let v2 = vec![true, false, true];
//}
//rather strangely, println is a macro!

//using macro
fn main() {
	println!("{}", "Hellow there!");
}
//Not using macro
fn main(){
	use std::io::{self, Write};
	io::stdout()
		.lock
		.write_all(b"Hellow there!\n")
		.unwrap();
}
// panic is also a macro
fn main() {
	panic!("Aww shit!");
}
// this immideately stoppes execution
//panics are also done immideately by the system
fn main() {
	let o1: Option<i32> = Some(128);
	o1.unwrap(); // this doesnt do anything bad
	/*let o2: Option<i32> = None;
	o2.unwrap(); // this causes shit to hit the fan and a panic.
	*/
}
//Idk what an option is, but it is apparentely a struct and not an enum
enum Option<T> {
	None,
	Some(T),
}
/*
impl<T> Option<T> {
	fn unwrap(self) -> T {
		match self {
			Self::Some(t) => t,
			Self::None => panic!(...),
		}
	}
}
*/
/*
result is also a enum
enum Result<T, E> {
	Ok(T),
	Err(E),
}
*/
//functions that can fail typically contain a result.
/*
let s1 = str::from_utf8(
	&[240, 159, 141, 137]
);
println!("{:?}", s1);
//this is tottally fine however.
let s2 = str::from_utf8(&[195, 40]);
println!("{:?}", s2);
//this will result in an error
*/
// you can use panics to get out of an error, kind of like those kernel messages i get whenever I try to use arch
/*
let s = str::from_utf8(
	&[240, 159, 141, 137]).unwrap();
println!("{:?}, s");
// this is fine code.
str::from_utf8(&[195, 40]).unwrap();
//this is not fine.
*/
//or you can use expect
/*
let s = str::from_utf8(&[195, 40])
.expect("valid utf-8");
//this is more like js
//this is good practice as it has more info about what was supposed to happen.
//"as with all things, we don't get want we want"; yeah fuck off old head
/*
let melon = &[240, 159, 141, 137];
match str::from_utf8(melon) {
	Ok(s) => println!("{}", s),
	Err(e) => panic!(e),
}
// this prints the watermelon emoji
*/
//Using if let is also ok.
let melon = &[240, 159,141,137];
if let Ok(s) = str::from_utf8(melon) {
	println!("{}", s);
}
// this has the same functionality as the previous line.
// you can also "bubble up the error"
let melon = &[240, 159, 141, 137];
match std::str::from_utf8(melon) {
	Ok(s) => println!("{}", s),
	Err(e) => return Err(e),
}
Ok(())// this is so normal, rust has specific syntax for it.
*/
/*
let melon = &[240,159,141,137];
let s = str::from_utf8(melon)?;
println!("{}", s); // this is the "rust way" to catch errors (I used it in my debtgame project)
Ok(())
*/
//ITERATORS section:
//this is his "favorite" iterator:
//let natural_numbers = 1..;
//it represents all possible numbers from 1 to infinity. 
//this is possible because iterators are computed "lazily"; only when they are needed to be.
//This iterator notation is called arrange:
/*
//0 or greater
(0..).contains(&100);
// 20 or less than 20
(..=20).contains(&20)/*)*/ //(I think the extra parentathesis is a typo)
// only 3, 4 and 5
(3..6).contains(&4)); //true
//computation only happens when the iterator is called.
// anything that is iterable can be used in a for loop.
/*
fn main(){
	for i in vec![52, 49, 21] {
		println!("I like number {}", i);
	}
}
// this can also be done with a slice
fn main(){
	for i in &[52,49,21]{
		println!("I like number {}", i);
	}
}

// this can also be done with a literal iterator.
fn main() {
	for c in "rust".chars() {
		println!("Give me a {}", c);
	}
}
//the output of this sounds like a shitty pop song
*/
//You can also use a iterator in a for loop.
fn main(){
	for c in "SuRPRISE INb0UND".chars()
	.filer(|c| c.is_lowercase())
	.flat_map(|c| c.to_uppercase()) {
		print!("{}", c); // not println, surprise lol
	}
}
//this is apparentely a good, modern way to do things
//writing rust is different to reading it, apparentely
//he is just going over the rust  compiler error messages
//Now: things to do:
/*
- The rust book
- Rust by example
-Read RUST
-This week in RUST
*/