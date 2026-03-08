package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiClick: ImageVector
    get() {
        if (_SiClick != null) {
            return _SiClick!!
        }
        _SiClick = ImageVector.Builder(
            name = "Filled.SiClick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.293f, 10.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, -0.208f)
                lineToRelative(10f, 4.4f)
                arcToRelative(1.001f, 1.001f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.15f, 1.882f)
                lineToRelative(-3.87f, 1.015f)
                lineToRelative(-1.016f, 3.872f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.882f, 0.148f)
                lineToRelative(-4.4f, -10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.208f, -1.109f)
                moveToRelative(-3.948f, 5.946f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.414f, 1.414f)
                lineToRelative(-2.121f, 2.121f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -1.414f)
                close()
                moveTo(5.005f, 10.995f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(4.224f, 4.225f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
                lineToRelative(2.121f, 2.122f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.345f, 7.76f)
                lineTo(4.224f, 5.64f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
                moveToRelative(14.142f, -0.006f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.413f, 1.414f)
                lineToRelative(-2.12f, 2.12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.415f, -1.413f)
                close()
                moveTo(11f, 5f)
                lineTo(11f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
            }
        }.build()

        return _SiClick!!
    }

@Suppress("ObjectPropertyName")
private var _SiClick: ImageVector? = null
