package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiMail: ImageVector
    get() {
        if (_SiMail != null) {
            return _SiMail!!
        }
        _SiMail = ImageVector.Builder(
            name = "Filled.SiMail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.8f, 4f)
                horizontalLineTo(3.2f)
                curveTo(2.54f, 4f, 2f, 4.54f, 2f, 5.2f)
                verticalLineToRelative(12.4f)
                curveTo(2f, 18.92f, 3.08f, 20f, 4.4f, 20f)
                horizontalLineToRelative(15.2f)
                curveToRelative(1.32f, 0f, 2.4f, -1.08f, 2.4f, -2.4f)
                verticalLineTo(5.2f)
                curveToRelative(0f, -0.66f, -0.54f, -1.2f, -1.2f, -1.2f)
                moveTo(5.65f, 6.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.3f, 1.52f)
                lineToRelative(6.87f, 5.89f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.78f, 0.285f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.78f, -0.286f)
                lineToRelative(6.87f, -5.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.3f, -1.518f)
                lineTo(12f, 11.744f)
                close()
            }
        }.build()

        return _SiMail!!
    }

@Suppress("ObjectPropertyName")
private var _SiMail: ImageVector? = null
