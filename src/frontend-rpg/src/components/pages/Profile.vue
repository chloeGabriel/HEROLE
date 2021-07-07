<template>
  <ProfileDetails
    :currentUser="currentUser"
  />
</template>

<script>
import ProfileDetails from "@/components/molecules/ProfileDetails";
export default {
  components: {
    ProfileDetails
  },
  computed: {
    currentUser() {
      return this.$store.state.auth.user;
    }
  },
  mounted() {
    if (!this.currentUser) {
      this.$router.push('/login');
    }
  }
};
</script>