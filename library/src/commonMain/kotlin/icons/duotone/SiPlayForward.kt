package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiPlayForward: ImageVector
    get() {
        if (_SiPlayForward != null) {
            return _SiPlayForward!!
        }
        _SiPlayForward = ImageVector.Builder(
            name = "Duotone.SiPlayForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveToRelative(4f, 5f)
                lineToRelative(10f, 7f)
                lineToRelative(-10f, 7f)
                close()
            }
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
                close()
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
                moveTo(21.43f, 11.386f)
                lineTo(11.43f, 4.386f)
                lineTo(10.57f, 5.614f)
                lineTo(20.57f, 12.614f)
                close()
                moveTo(11.43f, 19.614f)
                lineTo(21.43f, 12.614f)
                lineTo(20.57f, 11.386f)
                lineTo(10.57f, 18.386f)
                close()
                moveTo(10.25f, 5f)
                verticalLineToRelative(4.688f)
                horizontalLineToRelative(1.5f)
                lineTo(11.75f, 5f)
                close()
                moveTo(10.25f, 14.133f)
                lineTo(10.25f, 19f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.867f)
                close()
                moveTo(14.43f, 11.386f)
                lineTo(4.43f, 4.386f)
                lineTo(3.57f, 5.614f)
                lineTo(13.57f, 12.614f)
                close()
                moveTo(3.25f, 5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(1.5f)
                lineTo(4.75f, 5f)
                close()
                moveTo(4.43f, 19.614f)
                lineTo(14.43f, 12.614f)
                lineTo(13.57f, 11.386f)
                lineTo(3.57f, 18.386f)
                close()
            }
        }.build()

        return _SiPlayForward!!
    }

@Suppress("ObjectPropertyName")
private var _SiPlayForward: ImageVector? = null
