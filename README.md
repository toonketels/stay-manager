## Stay manager

Fetches airbnb ical feeds to create a trello card for each stay on a given board.


Flow:
- fetch ical feed
- parse it and transforms in stays
- compare stays with currently known stays
- define what needs to be updated, created or removed
- make api calls to trello to update, create cards