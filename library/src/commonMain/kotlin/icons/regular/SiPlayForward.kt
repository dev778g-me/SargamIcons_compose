package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiPlayForward: ImageVector
    get() {
        if (_SiPlayForward != null) {
            return _SiPlayForward!!
        }
        _SiPlayForward = ImageVector.Builder(
            name = "Regular.SiPlayForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 12f)
                lineToRelative(0.43f, 0.614f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.228f)
                close()
                moveTo(11f, 5f)
                lineToRelative(0.43f, -0.614f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.25f, 5f)
                close()
                moveTo(11f, 19f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.18f, 0.614f)
                close()
                moveTo(11.75f, 14.133f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                horizontalLineToRelative(1.5f)
                moveTo(14f, 12f)
                lineToRelative(0.43f, 0.614f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.228f)
                close()
                moveTo(4f, 5f)
                lineToRelative(0.43f, -0.614f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.25f, 5f)
                close()
                moveTo(4f, 19f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.18f, 0.614f)
                close()
                moveTo(21f, 12f)
                lineTo(21.43f, 11.386f)
                lineTo(11.43f, 4.386f)
                lineTo(11f, 5f)
                lineToRelative(-0.43f, 0.614f)
                lineToRelative(10f, 7f)
                close()
                moveTo(11f, 19f)
                lineTo(11.43f, 19.614f)
                lineTo(21.43f, 12.614f)
                lineTo(21f, 12f)
                lineToRelative(-0.43f, -0.614f)
                lineToRelative(-10f, 7f)
                close()
                moveTo(11f, 5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(4.688f)
                horizontalLineToRelative(1.5f)
                lineTo(11.75f, 5f)
                close()
                moveTo(11f, 14.133f)
                horizontalLineToRelative(-0.75f)
                lineTo(10.25f, 19f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.867f)
                close()
                moveTo(14f, 12f)
                lineToRelative(0.43f, -0.614f)
                lineToRelative(-10f, -7f)
                lineTo(4f, 5f)
                lineToRelative(-0.43f, 0.614f)
                lineToRelative(10f, 7f)
                close()
                moveTo(4f, 5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(1.5f)
                lineTo(4.75f, 5f)
                close()
                moveTo(4f, 19f)
                lineTo(4.43f, 19.614f)
                lineTo(14.43f, 12.614f)
                lineTo(14f, 12f)
                lineToRelative(-0.43f, -0.614f)
                lineToRelative(-10f, 7f)
                close()
            }
        }.build()

        return _SiPlayForward!!
    }

@Suppress("ObjectPropertyName")
private var _SiPlayForward: ImageVector? = null
