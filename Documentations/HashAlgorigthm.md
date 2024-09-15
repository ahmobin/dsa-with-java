# HashSet Data Structure

- **HashSet** is a data structure.
- **HashSet** is an efficient data structure because it takes constant time complexity:
    - To **add** -> `O(1)`
    - To **search** -> `O(1)`
    - To **remove** -> `O(1)`
- A **set** cannot contain duplicate values.
- **HashSet** is an **unordered** data structure.
- **HashSet** has no index, it contains only values.

## Common HashSet Functions

- `add()`
- `contains()`
- `size()`
- `remove()`

# HashMap
- In **HashMap** there contains data as key-value pair where key is unique.
- **HashMap** is an unordered map.

  | **Key** | **Value**  |
  |---------|------------|
  | `101`   | `"John"`   |
  | `102`   | `"Joe"`    |
  | `103`   | `"Doe"`    |
  | `104`   | `"John"`   |
  | `105`   | `"Ole"`    |
  | `106`   | `"Marius"` |
  | `101`   | `"Smith"`  |

- In the example there contains students name with an unique roll number (key) and students name (value) and same name can have multiple.
- And if I put a value with an existing key then the value will update with the new value.

## Common HashSet Functions
- `put(key, value)`
- `containsKey(key)`
- `get(key)`
- `entrySet()` 
- `keySet()` 
- `remove(key)` 

## Iterator Functions

- `next()`
- `hasNext()`

**Note**: The iterator's initial value is `null`. When it starts iterating, it begins with the first value and continues to the next one.

# Implementation HashMap In Java

In Java, internally **HashMap** stored as array of LinkedList.