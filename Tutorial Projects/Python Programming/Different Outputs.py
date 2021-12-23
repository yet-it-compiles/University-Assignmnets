""" Different operations and uses for Strings"""
first_name = "tyler"

print("This output is now changed ", first_name.upper())
print("This output is now changed ", first_name.capitalize(), end="\n\n")  # capitalizes the first letter

print("Not changed : ", first_name)  # remains unchanged as strings are immutable


intro = "We are working with strings today"
print(intro[0])  # should print W
print(intro[0:2])  # should print We

intro = "Ready?"  # Replaces the string

place_holder = f"Hello, \n {first_name}"  # allows for string formatting and the use of placeholder variables
escape_sequences = r"\n\n \t Hello"
print(place_holder, escape_sequences)

""" ================================================================================================================ """

# Default order
String1 = "{} {} {}".format('Geeks', 'For', 'Life')
print("Print String in default order: ")
print(String1)  # Geeks for life

# Positional Formatting
String1 = "{1} {0} {2}".format('Geeks', 'For', 'Life')
print("\nPrint String in Positional order: ")
print(String1)  # For Geek Life

# Keyword Formatting
String1 = "{l} {f} {g}".format(g='Geeks', f='For', l='Life')
print("\nPrint String in order of Keywords: ")
print(String1)  # life for geeks


string2 = "hello {}, how {} you today{}".format(first_name, 'are', '?')
print(string2)
string3 = f"Hello {first_name}, how are "