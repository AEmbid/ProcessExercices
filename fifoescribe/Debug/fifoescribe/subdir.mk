################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../fifoescribe/fifoescribe.c 

OBJS += \
./fifoescribe/fifoescribe.o 

C_DEPS += \
./fifoescribe/fifoescribe.d 


# Each subdirectory must supply rules for building sources it contributes
fifoescribe/%.o: ../fifoescribe/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: Cygwin C Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


