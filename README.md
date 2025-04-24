# README

## 1. Challenges Faced During This Exam

One of the main challenges I encountered during this exam was implementing the restriction of allowing only one ticket per movie per customer. Initially, I overlooked the need to check for existing tickets before booking a new one, which led to duplicate bookings. To resolve this, I updated the `bookTicket()` method in the `Cinema` class to loop through the existing tickets and verify whether the customer already had a ticket for the same movie. This ensured no duplicate bookings were allowed.

Another minor challenge was handling ticket cancellation. Since the ticket cancellation is based on object comparison, I realized that creating a new `Ticket` object with the same data wasn't enough — it wouldn't match the existing object in the list. I adjusted my approach and ensured proper object management for cancellation logic to work effectively.

## 2. Use of AI Tools for Learning Java Constructs

Yes, AI tools were very useful during this exam. I used an AI assistant to help me understand how to enforce the "one ticket per customer per movie" rule. Specifically:

- **Understanding Object Comparison in Java**: I used AI to learn how Java handles object comparison (`equals()` vs `==`), which helped me debug issues related to ticket cancellation.
- **Designing Class Structure**: I consulted AI to make sure my class structure (`Cinema`, `Movie`, `Ticket`) was appropriate and followed basic object-oriented principles.
- **Formatting Output and Improving Code Readability**: I asked AI to help me make sure my `toString()` methods in both `Movie` and `Ticket` classes were clean and user-friendly for printed output.

### What Was Done Using AI:
- AI helped clarify how to use collection types like `ArrayList`, how to iterate through them safely, and how to write conditions to check for duplicates.
- I used AI to review and explain sections of the code I wasn’t confident about, particularly in managing ticket bookings and cancellations.

## 3. Cases Where AI Did Not Produce the Desired Result

There were some cases where AI tools didn’t provide exactly what I needed:

- **Ticket Cancellation Logic**: I asked AI how to cancel a ticket based on the same `Movie` and `customerName`, expecting it to match the ticket in the list. However, the suggestion it gave did not work because it ignored how Java checks object equality — I needed to manage the actual ticket object rather than rely on a new instance with the same data.
- **Understanding Subtle Java Behavior**: When asking AI about Java behavior related to reference vs value types, I sometimes got overly simplified answers. I had to go back to official documentation and test it manually to fully understand the problem.

---

This project was a good blend of coding and problem-solving, and AI was a helpful assistant — though not always a complete solution.
