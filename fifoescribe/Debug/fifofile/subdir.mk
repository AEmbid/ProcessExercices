################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../fifofile/fifocrea.c \
../fifofile/fifoescribe.c 

OBJS += \
./fifofile/fifocrea.o \
./fifofile/fifoescribe.o 

C_DEPS += \
./fifofile/fifocrea.d \
./fifofile/fifoescribe.d 


# Each subdirectory must supply rules for building sources it contributes
fifofile/%.o: ../fifofile/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: Cygwin C Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


