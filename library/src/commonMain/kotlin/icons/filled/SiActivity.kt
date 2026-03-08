package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiActivity: ImageVector
    get() {
        if (_SiActivity != null) {
            return _SiActivity!!
        }
        _SiActivity = ImageVector.Builder(
            name = "Filled.SiActivity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.024f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.924f, 0.684f)
                lineTo(19.721f, 11f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.948f, -0.684f)
                lineToRelative(-2.125f, -6.373f)
                lineToRelative(-5.995f, 15.42f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.846f, 0.043f)
                lineTo(4.35f, 13f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.914f, 0.594f)
                lineToRelative(3.024f, 6.805f)
                lineToRelative(6.13f, -15.761f)
                lineToRelative(0.068f, -0.14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.024f, 2f)
            }
        }.build()

        return _SiActivity!!
    }

@Suppress("ObjectPropertyName")
private var _SiActivity: ImageVector? = null
