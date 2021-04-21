Fetch user details anywhere :

UserDetails userDetails =
(UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

// userDetails.getUsername()
// userDetails.getPassword()
// userDetails.getAuthorities()

=====================================
