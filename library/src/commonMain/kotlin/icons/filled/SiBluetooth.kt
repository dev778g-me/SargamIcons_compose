package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiBluetooth: ImageVector
    get() {
        if (_SiBluetooth != null) {
            return _SiBluetooth!!
        }
        _SiBluetooth = ImageVector.Builder(
            name = "Filled.SiBluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.576f, 1.095f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.065f, 0.136f)
                lineToRelative(6f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.005f, 1.533f)
                lineTo(13.639f, 12f)
                lineToRelative(5.007f, 4.236f)
                arcToRelative(1.002f, 1.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.005f, 1.532f)
                lineToRelative(-6f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 22f)
                verticalLineToRelative(-7.768f)
                lineToRelative(-5.355f, 4.532f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.291f, -1.528f)
                lineTo(10.542f, 12f)
                lineTo(4.355f, 6.764f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.29f, -1.528f)
                lineTo(11f, 9.766f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.576f, -0.905f)
            }
        }.build()

        return _SiBluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _SiBluetooth: ImageVector? = null
