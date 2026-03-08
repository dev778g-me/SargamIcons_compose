package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiWebcam: ImageVector
    get() {
        if (_SiWebcam != null) {
            return _SiWebcam!!
        }
        _SiWebcam = ImageVector.Builder(
            name = "Regular.SiWebcam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.25f, 22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                horizontalLineToRelative(-1.5f)
                moveTo(6f, 22f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1.5f)
                lineTo(6f, 21.25f)
                close()
                moveTo(12f, 22f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(4f)
                close()
                moveTo(20f, 10f)
                horizontalLineToRelative(-0.75f)
                arcTo(7.25f, 7.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17.25f)
                verticalLineToRelative(1.5f)
                arcTo(8.75f, 8.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.75f, 10f)
                close()
                moveTo(12f, 18f)
                verticalLineToRelative(-0.75f)
                arcTo(7.25f, 7.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.75f, 10f)
                horizontalLineToRelative(-1.5f)
                arcTo(8.75f, 8.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18.75f)
                close()
                moveTo(4f, 10f)
                horizontalLineToRelative(0.75f)
                arcTo(7.25f, 7.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.75f)
                verticalLineToRelative(-1.5f)
                arcTo(8.75f, 8.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.25f, 10f)
                close()
                moveTo(12f, 2f)
                verticalLineToRelative(0.75f)
                arcTo(7.25f, 7.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.25f, 10f)
                horizontalLineToRelative(1.5f)
                arcTo(8.75f, 8.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.25f)
                close()
                moveTo(14f, 10f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                verticalLineToRelative(1.5f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.75f, 10f)
                close()
                moveTo(12f, 12f)
                verticalLineToRelative(-0.75f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                horizontalLineToRelative(-1.5f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12.75f)
                close()
                moveTo(10f, 10f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                verticalLineToRelative(-1.5f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.25f, 10f)
                close()
                moveTo(12f, 8f)
                verticalLineToRelative(0.75f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                horizontalLineToRelative(1.5f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7.25f)
                close()
            }
        }.build()

        return _SiWebcam!!
    }

@Suppress("ObjectPropertyName")
private var _SiWebcam: ImageVector? = null
