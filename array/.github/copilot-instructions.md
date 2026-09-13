# Copilot Instructions for Java Array Algorithms

## Project Overview
This is a learning/practice repository for fundamental Java array algorithms, specifically implementing linear search patterns. The codebase demonstrates basic array traversal and element searching.

## Key Code Patterns

### Linear Search Implementation
- Located in `linearsearch.java`
- Uses standard for-loop to iterate through array elements
- Pattern: Sequential traversal with conditional matching
- Current implementation uses String arrays with direct comparison

**Important Note**: The current code uses `==` for String comparison (line 4). This is a known Java pitfall - use `.equals()` or `.equalsIgnoreCase()` for proper String comparison in production code.

## Code Style Conventions
- Class names follow camelCase (e.g., `linearsearch`) - consider PascalCase for Java conventions
- Array declarations use inline initialization: `String[] menu = {...}`
- Simple linear output via `System.out.println()`
- Direct variable naming without getter/setter patterns

## Development Workflow
- Single-file structure - no build system required
- Compile with: `javac linearsearch.java`
- Execute with: `java linearsearch`
- No external dependencies or testing framework

## AI Agent Guidance
When enhancing this codebase:
1. **Search Algorithm Improvements**: Implement parameterized search targets instead of hardcoded values
2. **String Handling**: Replace `==` with `.equals()` for proper String comparison
3. **Generics**: Consider making search methods accept generic arrays instead of just Strings
4. **Naming**: Follow Java conventions - use PascalCase for class names (`LinearSearch`)
5. **Testing**: If adding test methods, use JUnit or add a separate test class
