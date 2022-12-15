# Workflows

This directory contains workflow files for GitHub Actions.  The resulting image is pushed to the GitHub packages for this repository

### Notes:
  - when pushing an image to GitHub Container registry (ghcr.io) it is pished as a public image by default
  - if a private image with the same name exists, the image push will fail
  - if the image was previously pushed from the CLI, it is likely private and the push will faili from this workflow.  Either delete or change permissions on the existing image from the Packages Tab in Github
  - can also associate a manually pushed package to a repository.  Be sure to also give the package the same permissions as the repo